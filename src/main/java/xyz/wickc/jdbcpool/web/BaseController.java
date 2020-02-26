package xyz.wickc.jdbcpool.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wickc.jdbcpool.domain.Episode;
import xyz.wickc.jdbcpool.service.EpisodeService;

import java.util.List;

/**
 * Created on 2020/2/26
 *
 * @author wicks
 * @since 1.8
 */

@Controller
public class BaseController {

    private final EpisodeService service;

    public BaseController(EpisodeService service) {
        this.service = service;
    }

    @RequestMapping(value = "/Episode",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getEpisodes(){
        List<Episode> episodeList = service.gatEpisodes();
        JSONArray jsonArray = (JSONArray) JSON.toJSON(episodeList);

        return jsonArray.toJSONString();
    }
}
