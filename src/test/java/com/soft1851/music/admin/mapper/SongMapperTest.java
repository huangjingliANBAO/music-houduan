package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.soft1851.music.admin.domain.entity.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongMapperTest {
    @Resource
    private SongMapper songMapper;

    @Test
    void name() {
        // 查询所有
        System.out.println(songMapper.selectAll().get(songMapper.selectAll().size() - 1));

    }
}