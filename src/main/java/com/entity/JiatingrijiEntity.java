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
 * 家庭日记
 *
 * @author 
 * @email
 */
@TableName("jiatingriji")
public class JiatingrijiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiatingrijiEntity() {

	}

	public JiatingrijiEntity(T t) {
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
        return "Jiatingriji{" +
            "id=" + id +
            ", jiatingrijiName=" + jiatingrijiName +
            ", jiatingrijiTypes=" + jiatingrijiTypes +
            ", jiatingrijiPhoto=" + jiatingrijiPhoto +
            ", yonghuId=" + yonghuId +
            ", jiatingrijiTime=" + jiatingrijiTime +
            ", jiatingrijiContent=" + jiatingrijiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
