package com.mapper.example.demo.service;

import com.mapper.example.demo.mapper.MappingData;
import com.mapper.example.demo.mapper.userDto.UserDTO;
import com.mapper.example.demo.mapper.userEntity.UserEntity;
import com.mapper.example.demo.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ChessServiceImpl implements ChessService {
    @Autowired
    Repo repo;
    private UserEntity u1 = new UserEntity();

    @Override
    public void addUserDetails(String userId) {
        WebClient webClient = WebClient.builder().baseUrl("https://api.chess.com/pub/player")
                .build();

        Mono<UserDTO> userMono2 = webClient.get().uri("/" + userId).accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(UserDTO.class);

        userMono2.doOnSuccess(r -> {
            this.u1 = MappingData.INSTANCE.dtoToEntity(r);
            System.out.println(this.u1.getUsername()+" saved");
            //saveData(this.u1);

        }).subscribe();

    }
    private void saveData(UserEntity user){
        this.repo.save(user);
    }
}
