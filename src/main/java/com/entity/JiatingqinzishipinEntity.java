package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 家庭亲子视频
 *
 * @author 
 * @email
 */
@TableName("jiatingqinzishipin")
public class JiatingqinzishipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiatingqinzishipinEntity() {

	}

	public JiatingqinzishipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 亲子视频标题
     */
    @TableField(value = "jiatingqinzishipin_name")

    private String jiatingqinzishipinName;


    /**
     * 视频类型
     */
    @TableField(value = "jiatingqinzishipin_types")

    private Integer jiatingqinzishipinTypes;


    /**
     * 封面
     */
    @TableField(value = "jiatingqinzishipin_photo")

    private String jiatingqinzishipinPhoto;


    /**
     * 视频类型
     */
    @TableField(value = "jiatingqinzishipin_video")

    private String jiatingqinzishipinVideo;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 视频详情
     */
    @TableField(value = "jiatingqinzishipin_content")

    private String jiatingqinzishipinContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：亲子视频标题
	 */
    public String getJiatingqinzishipinName() {
        return jiatingqinzishipinName;
    }
    /**
	 * 获取：亲子视频标题
	 */

    public void setJiatingqinzishipinName(String jiatingqinzishipinName) {
        this.jiatingqinzishipinName = jiatingqinzishipinName;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getJiatingqinzishipinTypes() {
        return jiatingqinzishipinTypes;
    }
    /**
	 * 获取：视频类型
	 */

    public void setJiatingqinzishipinTypes(Integer jiatingqinzishipinTypes) {
        this.jiatingqinzishipinTypes = jiatingqinzishipinTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getJiatingqinzishipinPhoto() {
        return jiatingqinzishipinPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setJiatingqinzishipinPhoto(String jiatingqinzishipinPhoto) {
        this.jiatingqinzishipinPhoto = jiatingqinzishipinPhoto;
    }
    /**
	 * 设置：视频类型
	 */
    public String getJiatingqinzishipinVideo() {
        return jiatingqinzishipinVideo;
    }
    /**
	 * 获取：视频类型
	 */

    public void setJiatingqinzishipinVideo(String jiatingqinzishipinVideo) {
        this.jiatingqinzishipinVideo = jiatingqinzishipinVideo;
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
	 * 设置：视频详情
	 */
    public String getJiatingqinzishipinContent() {
        return jiatingqinzishipinContent;
    }
    /**
	 * 获取：视频详情
	 */

    public void setJiatingqinzishipinContent(String jiatingqinzishipinContent) {
        this.jiatingqinzishipinContent = jiatingqinzishipinContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiatingqinzishipin{" +
            "id=" + id +
            ", jiatingqinzishipinName=" + jiatingqinzishipinName +
            ", jiatingqinzishipinTypes=" + jiatingqinzishipinTypes +
            ", jiatingqinzishipinPhoto=" + jiatingqinzishipinPhoto +
            ", jiatingqinzishipinVideo=" + jiatingqinzishipinVideo +
            ", yonghuId=" + yonghuId +
            ", jiatingqinzishipinContent=" + jiatingqinzishipinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
