package com.entity.vo;

import com.entity.JiatingrijiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 家庭日记
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiatingriji")
public class JiatingrijiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 日记标题
     */

    @TableField(value = "jiatingriji_name")
    private String jiatingrijiName;


    /**
     * 日记类型
     */

    @TableField(value = "jiatingriji_types")
    private Integer jiatingrijiTypes;


    /**
     * 图片
     */

    @TableField(value = "jiatingriji_photo")
    private String jiatingrijiPhoto;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 记录日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiatingriji_time")
    private Date jiatingrijiTime;


    /**
     * 日记内容
     */

    @TableField(value = "jiatingriji_content")
    private String jiatingrijiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：日记标题
	 */
    public String getJiatingrijiName() {
        return jiatingrijiName;
    }


    /**
	 * 获取：日记标题
	 */

    public void setJiatingrijiName(String jiatingrijiName) {
        this.jiatingrijiName = jiatingrijiName;
    }
    /**
	 * 设置：日记类型
	 */
    public Integer getJiatingrijiTypes() {
        return jiatingrijiTypes;
    }


    /**
	 * 获取：日记类型
	 */

    public void setJiatingrijiTypes(Integer jiatingrijiTypes) {
        this.jiatingrijiTypes = jiatingrijiTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getJiatingrijiPhoto() {
        return jiatingrijiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setJiatingrijiPhoto(String jiatingrijiPhoto) {
        this.jiatingrijiPhoto = jiatingrijiPhoto;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：记录日期
	 */
    public Date getJiatingrijiTime() {
        return jiatingrijiTime;
    }


    /**
	 * 获取：记录日期
	 */

    public void setJiatingrijiTime(Date jiatingrijiTime) {
        this.jiatingrijiTime = jiatingrijiTime;
    }
    /**
	 * 设置：日记内容
	 */
    public String getJiatingrijiContent() {
        return jiatingrijiContent;
    }


    /**
	 * 获取：日记内容
	 */

    public void setJiatingrijiContent(String jiatingrijiContent) {
        this.jiatingrijiContent = jiatingrijiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
