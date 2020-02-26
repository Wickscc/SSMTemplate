package xyz.wickc.jdbcpool.dao;

import org.springframework.stereotype.Repository;
import xyz.wickc.jdbcpool.domain.Episode;

import java.util.List;

/**
 * Created on 2020/2/26
 *
 * @author wicks
 * @since 1.8
 */
@Repository
public interface EpisodeDao {
    List<Episode> getEpisodes();
}
