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
 * 亲友动态
 *
 * @author 
 * @email
 */
@TableName("qinyoumokuai")
public class QinyoumokuaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QinyoumokuaiEntity() {

	}

	public QinyoumokuaiEntity(T t) {
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
     * 动态标题
     */
    @TableField(value = "qinyoumokuai_name")

    private String qinyoumokuaiName;


    /**
     * 动态类型
     */
    @TableField(value = "qinyoumokuai_types")

    private Integer qinyoumokuaiTypes;


    /**
     * 封面
     */
    @TableField(value = "qinyoumokuai_photo")

    private String qinyoumokuaiPhoto;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 动态详情
     */
    @TableField(value = "qinyoumokuai_content")

    private String qinyoumokuaiContent;


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
	 * 设置：动态标题
	 */
    public String getQinyoumokuaiName() {
        return qinyoumokuaiName;
    }
    /**
	 * 获取：动态标题
	 */

    public void setQinyoumokuaiName(String qinyoumokuaiName) {
        this.qinyoumokuaiName = qinyoumokuaiName;
    }
    /**
	 * 设置：动态类型
	 */
    public Integer getQinyoumokuaiTypes() {
        return qinyoumokuaiTypes;
    }
    /**
	 * 获取：动态类型
	 */

    public void setQinyoumokuaiTypes(Integer qinyoumokuaiTypes) {
        this.qinyoumokuaiTypes = qinyoumokuaiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getQinyoumokuaiPhoto() {
        return qinyoumokuaiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setQinyoumokuaiPhoto(String qinyoumokuaiPhoto) {
        this.qinyoumokuaiPhoto = qinyoumokuaiPhoto;
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
	 * 设置：动态详情
	 */
    public String getQinyoumokuaiContent() {
        return qinyoumokuaiContent;
    }
    /**
	 * 获取：动态详情
	 */

    public void setQinyoumokuaiContent(String qinyoumokuaiContent) {
        this.qinyoumokuaiContent = qinyoumokuaiContent;
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
        return "Qinyoumokuai{" +
            "id=" + id +
            ", qinyoumokuaiName=" + qinyoumokuaiName +
            ", qinyoumokuaiTypes=" + qinyoumokuaiTypes +
            ", qinyoumokuaiPhoto=" + qinyoumokuaiPhoto +
            ", yonghuId=" + yonghuId +
            ", qinyoumokuaiContent=" + qinyoumokuaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
