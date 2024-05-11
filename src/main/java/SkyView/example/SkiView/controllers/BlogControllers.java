package SkyView.example.SkiView.controllers;

import SkyView.example.SkiView.models.Post;
import SkyView.example.SkiView.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogControllers {
    @Autowired
    private PostRepository postRepository;


    @GetMapping("/blog")
        public String blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
            return "blog-main";

        }
    }

