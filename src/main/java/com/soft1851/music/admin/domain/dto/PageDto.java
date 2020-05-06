package com.soft1851.music.admin.domain.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/25
 */
@Data
@Builder
public class PageDto {
    private int currentSize;
    private int size;
}
