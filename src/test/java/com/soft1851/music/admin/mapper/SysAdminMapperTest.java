package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.domain.entity.SysAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysAdminMapperTest {
    @Resource
    private SysAdminMapper sysAdminMapper;
    @Test
    void getSysAdminById() throws SQLException {
        SysAdmin sysAdmin = sysAdminMapper.getSysAdminById("aa");
        System.out.println(sysAdmin);
    }
}