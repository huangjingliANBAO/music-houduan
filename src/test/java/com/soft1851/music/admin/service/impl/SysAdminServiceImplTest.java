package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.domain.entity.SysAdmin;
import com.soft1851.music.admin.service.SysAdminService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class SysAdminServiceImplTest {
@Resource
private SysAdminService sysAdminService;
    @Test
    void updateSysAdmin() {
        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.setId("aab");
        sysAdmin.setName("mqxu");
        sysAdmin.setPassword("12345");
        sysAdmin.setAvatar("测试头像23232");
        sysAdminService.updateSysAdmin(sysAdmin);
    }
}