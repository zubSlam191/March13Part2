package com.animals.conf;

import com.animals.animalservices.Impl.BearImpl;
import com.animals.animalservices.Impl.CowImpl;
import com.animals.animalservices.Impl.DogImpl;
import com.animals.animalservices.Zoo;
import org.springframework.context.annotation.*;

/**
 * Created by student on 2016/03/13.
 */
@Configuration
public class AppConfig {

        @Bean(name="bear")
        public Zoo getBear(){
            return new BearImpl();
        }
        @Bean(name="cow")
        public Zoo getCow(){

            return new CowImpl();
        }
        @Bean(name="dog")
        public Zoo getDog(){

            return new DogImpl();
        }

}
