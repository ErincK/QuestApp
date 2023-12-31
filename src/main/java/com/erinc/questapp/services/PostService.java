package com.erinc.questapp.services;

import com.erinc.questapp.entities.Post;
import com.erinc.questapp.entities.User;
import com.erinc.questapp.repos.IPostRepository;
import com.erinc.questapp.requests.PostCreateReauest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private IPostRepository postRepository;
    private UserService userService;

    public PostService(IPostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }

    public List<Post> getAllPosts(Optional<Long> userId) {
        if (userId.isPresent())
            return postRepository.findByUserId(userId.get());
        return postRepository.findAll();
    }

    public Post getOnePostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public Post createOnePost(PostCreateReauest newPostRequest) {
        User user = userService.getOneUser(newPostRequest.getUserId());
        if(user==null)
            return null;
        Post toSave = new Post();
        toSave.setId(newPostRequest.getId());
        toSave.setText(newPostRequest.getText());
        toSave.setTitle(newPostRequest.getTitle());
        toSave.setUser(user);
        return postRepository.save(toSave);
    }
}
