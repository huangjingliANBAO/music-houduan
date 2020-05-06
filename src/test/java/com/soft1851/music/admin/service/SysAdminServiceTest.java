package com.soft1851.music.admin.service;

import com.soft1851.music.admin.domain.dto.LoginDto;
import com.soft1851.music.admin.domain.entity.SysAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/21
 */
@SpringBootTest
class SysAdminServiceTest {
    @Resource
    private SysAdminService sysAdminService;

    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder().name("yhChen").password("123456").build();
        System.out.println(sysAdminService.login(loginDto));
    }

    @Test
    void selectByName() {
        System.out.println(sysAdminService.getAdminAndRolesByName("yhChen"));
    }
    @Test
    void updateSysAdmin() {
        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.setId("aa");
        sysAdmin.setName("huang");
        sysAdmin.setPassword("12345");
        sysAdmin.setAvatar("测试头像");
        sysAdminService.updateSysAdmin(sysAdmin);
    }
}