package com.soft1851.music.admin.service;

import com.soft1851.music.admin.domain.entity.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/26
 */
@SpringBootTest
class SongServiceTest {
    @Resource
    private SongService songService;

    @Test
    void selectAll() {
        List<Song> songList = songService.selectAll();
        songList.forEach(System.out::println);
    }

    @Test
    void getPage() {
        int currentPage = 1;
        int size = 50;
        List<Song> songList = songService.getPage(currentPage, size);
        songList.forEach(System.out::println);
    }

    @Test
    void getSongBy() {
        String singer = "周杰伦";
        String songName = "";
        String songId = "";
        List<Song> songList = songService.getSongBy(singer);
        songList.forEach(System.out::println);
    }

    @Test
    void getSongByDate() {
    }

    @Test
    void batchInsert() {
    }

    @Test
    void exportData() {
        songService.exportData();
    }

    @Test
    void deleteById() {
        songService.deleteById(1368933983);
    }
}