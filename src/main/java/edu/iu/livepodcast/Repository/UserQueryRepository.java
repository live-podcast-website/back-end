package edu.iu.livepodcast.Repository;



import edu.iu.livepodcast.models.UserModel;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Sujeet on 12/2/16.
 */

@org.springframework.stereotype.Repository
public interface UserQueryRepository extends  CrudRepository<UserModel,String>{

    UserModel findByUserid(String userid);

}
