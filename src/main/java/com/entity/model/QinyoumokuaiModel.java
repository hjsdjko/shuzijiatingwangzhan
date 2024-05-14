package com.entity.model;

import com.entity.QinyoumokuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 亲友动态
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QinyoumokuaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 动态标题
     */
    private String qinyoumokuaiName;


    /**
     * 动态类型
     */
    private Integer qinyoumokuaiTypes;


    /**
     * 封面
     */
    private String qinyoumokuaiPhoto;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 动态详情
     */
    private String qinyoumokuaiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：动态标题
	 */
    public String getQinyoumokuaiName() {
        return qinyoumokuaiName;
    }


    /**
	 * 设置：动态标题
	 */
    public void setQinyoumokuaiName(String qinyoumokuaiName) {
        this.qinyoumokuaiName = qinyoumokuaiName;
    }
    /**
	 * 获取：动态类型
	 */
    public Integer getQinyoumokuaiTypes() {
        return qinyoumokuaiTypes;
    }


    /**
	 * 设置：动态类型
	 */
    public void setQinyoumokuaiTypes(Integer qinyoumokuaiTypes) {
        this.qinyoumokuaiTypes = qinyoumokuaiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getQinyoumokuaiPhoto() {
        return qinyoumokuaiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setQinyoumokuaiPhoto(String qinyoumokuaiPhoto) {
        this.qinyoumokuaiPhoto = qinyoumokuaiPhoto;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：动态详情
	 */
    public String getQinyoumokuaiContent() {
        return qinyoumokuaiContent;
    }


    /**
	 * 设置：动态详情
	 */
    public void setQinyoumokuaiContent(String qinyoumokuaiContent) {
        this.qinyoumokuaiContent = qinyoumokuaiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
