package org.jpatest.demo;

import org.jpatest.demo.dto.Paging;
import org.jpatest.demo.model.Author;
import org.jpatest.demo.model.Post;
import org.jpatest.demo.repository.AuthorRepository;
import org.jpatest.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontController {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    PostRepository postRepository;


    @GetMapping("/index")
    public String getIndex(Model model) {

        model.addAttribute("list", new ArrayList<>());
        return "index";
    }

    @GetMapping("/author/list")
    public String getAuthorList(Model model) {
        List<Author> authorList = authorRepository.findAll();

        model.addAttribute("authorList", authorList);
        return "authorList";
    }

    @GetMapping("post/list")
    public String getPostList(
            Pageable pageable,
            Model model
    ) {
        pageable = PageRequest.of(pageable.getPageNumber() == 0 ? pageable.getPageNumber() : pageable.getPageNumber() - 1, 4, new Sort(Sort.Direction.DESC, "id"));
        Page<Post> postList = postRepository.findAll(pageable);

        Paging paging = new Paging();
        paging.setPageNo(pageable.getPageNumber() + 1);
        paging.setPageSize(pageable.getPageSize());
        paging.setTotalCount((int)postList.getTotalElements());

        model.addAttribute("postList", postList);
        model.addAttribute("paging", paging);
        return "postList";
    }

    @GetMapping("/post/write")
    public String getPostWrite() {
        return "postWrite";
    }

    @GetMapping("/post/write/{postId}")
    public String getPostDetail(
            @PathVariable("postId") Integer postId,
            Model model
    ) {
        Post post = postRepository.findById(postId);
        model.addAttribute("post", post);

        return "postWrite";
    }

    @PostMapping("/post/write")
    public String postPostWrite(
            @RequestParam(value = "author") String author,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content,
            RedirectAttributes rttr
    ) {
        Author auth = authorRepository.findByName(author);
        if (auth != null) {
            Post post = new Post();
            post.setAuthor(auth.getId());
            post.setTitle(title);
            post.setContent(content);
            Post newOne = postRepository.save(post);
            rttr.addFlashAttribute("status", "success");
        } else {
            rttr.addFlashAttribute("status", "failure");
        }

        return "redirect:/post/list";
    }

    @PostMapping("/post/write/{postId}")
    public String postPostWrite(
            @PathVariable("postId") Integer postId,
            @RequestParam(value = "author") String author,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content,
            RedirectAttributes rttr
    ) {
        Author auth = authorRepository.findByName(author);
        if (auth != null) {
            Post post = postRepository.findById(postId);
            post.setAuthor(auth.getId());
            post.setTitle(title);
            post.setContent(content);
            postRepository.save(post);
            Long count = postRepository.countByAuthor(auth.getId());
            rttr.addFlashAttribute("status", "success");
        } else {
            rttr.addFlashAttribute("status", "failure");
        }
        return "redirect:/post/list";
    }

}
