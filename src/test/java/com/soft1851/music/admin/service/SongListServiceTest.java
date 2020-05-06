package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft1851.music.admin.CloudMusicAdminApplication;
import com.soft1851.music.admin.domain.entity.SongList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/24
 */
@SpringBootTest(classes = CloudMusicAdminApplication.class)
class SongListServiceTest {
    @Resource
    private SongListService songListService;

    @Test
    void selectAll() throws IOException {
        List<Map<String, Object>> maps = songListService.selectAll();
        System.out.println(maps.size());
        maps.forEach(System.out::println);
    }

    @Test
    void getByPage() {
        Page<SongList> page = new Page<>(1, 50);
        QueryWrapper<SongList> wrapper = new QueryWrapper<>(null);
        IPage<SongList> page1 = songListService.page(page, wrapper);
//        System.out.println(page1.getRecords());
        page1.getRecords().forEach(System.out::println);
        System.out.println("总页数" + page1.getPages());
    }

    @Test
    void getByType() {
        List<Map<String, Object>> maps = new ArrayList<>();
        maps = songListService.getByType();
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    void getBlurSelect() {
        List<SongList> maps = songListService.blurSelect("0");
//        System.out.println(maps);
        maps.forEach(System.out::println);
        System.out.println(maps.size());
    }

    @Test
    void exportData() {
        songListService.exportData();
    }
}