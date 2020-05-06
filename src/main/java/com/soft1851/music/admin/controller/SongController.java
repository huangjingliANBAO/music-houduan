package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.domain.entity.Song;
import com.soft1851.music.admin.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yhChen
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/song")
@Slf4j
public class SongController {
    @Resource
    private SongService songService;

    @GetMapping("/list")
    public List<Song> selectAll() {
        return songService.selectAll();
    }

    @GetMapping("/page")
    public List<Song> getPage(@Param("currentPage") int currentPage, @Param("size") int size) {
        return songService.getPage(currentPage, size);
    }

    @GetMapping("/blur")
    public List<Song> getSongBy(@Param("field") String field) {
        return songService.getSongBy(field);
    }

    @GetMapping("/paragraph")
    public List<Song> getSongByTime(@Param("flag") String flag) {
        log.info(flag);
        return songService.getSongByDate(flag);
    }

    @GetMapping(value = "/export")
    public void exportData() {
        songService.exportData();
    }
    @DeleteMapping(value = "/delete")
    public void deleteById(int id) {
        songService.deleteById(id);
    }

}
