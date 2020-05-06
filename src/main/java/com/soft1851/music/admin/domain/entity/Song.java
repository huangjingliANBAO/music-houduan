package com.soft1851.music.admin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.soft1851.music.admin.annotation.ExcelVoAttribute;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yhChen
 * @since 2020-04-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("song")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Song extends Model<Song> {

    private static final long serialVersionUID = 1L;

    /**
     * 歌曲id
     */
    @TableId("song_id")
    @ExcelVoAttribute(name = "歌曲ID", column = 0)
    private String songId;

    /**
     * 歌曲名称
     */
    @TableField("song_name")
    @ExcelVoAttribute(name = "歌曲名称", column = 1)
    private String songName;

    /**
     * 排序id
     */
    @JsonIgnore
    @TableField("sort_id")
    private String sortId;

    /**
     * 歌手
     */
    @TableField("singer")
    @ExcelVoAttribute(name = "歌手", column = 2)
    private String singer;

    /**
     * 时长
     */
    @TableField("duration")
    private String duration;

    /**
     * 封面图
     */
    @JsonIgnore
    @TableField("thumbnail")
    private String thumbnail;

    /**
     * 歌曲地址
     */
    @TableField("url")
    private String url;

    /**
     * 歌词
     */
    @TableField("lyric")
    private String lyric;

    /**
     * 评论量
     */
    @JsonIgnore
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 收藏量
     */
    @JsonIgnore
    @TableField("like_count")
    private Integer likeCount;

    /**
     * 播放量
     */
    @JsonIgnore
    @TableField("play_count")
    private Integer playCount;

    /**
     * 删除标志
     */
    @JsonIgnore
    @TableField("delete_flag")
    private String deleteFlag;

    /**
     * 修改时间
     */
    @JsonIgnore
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.songId;
    }

}
