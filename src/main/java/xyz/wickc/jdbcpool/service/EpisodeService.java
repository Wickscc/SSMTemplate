package xyz.wickc.jdbcpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wickc.jdbcpool.dao.EpisodeDao;
import xyz.wickc.jdbcpool.domain.Episode;

import java.util.List;

/**
 * Created on 2020/2/26
 *
 * 配置注解式事务
 *      其中的 rollbackFor 表示的是程序中抛出了指定的异常过后则执行 回滚操作!
 *
 * @author wicks
 * @since 1.8
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EpisodeService {
    private final EpisodeDao dao;
    public EpisodeService(EpisodeDao dao) {
        this.dao = dao;
    }

    public List<Episode> gatEpisodes(){
        return dao.getEpisodes();
    }
}
