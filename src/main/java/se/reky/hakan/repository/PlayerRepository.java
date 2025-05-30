package se.reky.hakan.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import se.reky.hakan.Player;


import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    @NonNull
    List<Player> findAll(@NonNull Sort sort);
}
