package net.eprojex.handoferis.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
                                                    //User is the object, Integer is the prim
                                                    //Note this is an interface
public interface UserRepository extends JpaRepository<User, Integer> {

}
