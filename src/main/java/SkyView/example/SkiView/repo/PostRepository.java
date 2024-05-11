package SkyView.example.SkiView.repo;

import SkyView.example.SkiView.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {


}
