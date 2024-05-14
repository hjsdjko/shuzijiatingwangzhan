package com.entity.model;

import com.entity.JiatingrijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家庭日记
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiatingrijiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 日记标题
     */
    private String jiatingrijiName;


    /**
     * 日记类型
     */
    private Integer jiatingrijiTypes;


    /**
     * 图片
     */
    private String jiatingrijiPhoto;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 记录日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiatingrijiTime;


    /**
     * 日记内容
     */
    private String jiatingrijiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show2 photoShow
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
	 * 获取：日记标题
	 */
    public String getJiatingrijiName() {
        return jiatingrijiName;
    }


    /**
	 * 设置：日记标题
	 */
    public void setJiatingrijiName(String jiatingrijiName) {
        this.jiatingrijiName = jiatingrijiName;
    }
    /**
	 * 获取：日记类型
	 */
    public Integer getJiatingrijiTypes() {
        return jiatingrijiTypes;
    }


    /**
	 * 设置：日记类型
	 */
    public void setJiatingrijiTypes(Integer jiatingrijiTypes) {
        this.jiatingrijiTypes = jiatingrijiTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getJiatingrijiPhoto() {
        return jiatingrijiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setJiatingrijiPhoto(String jiatingrijiPhoto) {
        this.jiatingrijiPhoto = jiatingrijiPhoto;
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
	 * 获取：记录日期
	 */
    public Date getJiatingrijiTime() {
        return jiatingrijiTime;
    }


    /**
	 * 设置：记录日期
	 */
    public void setJiatingrijiTime(Date jiatingrijiTime) {
        this.jiatingrijiTime = jiatingrijiTime;
    }
    /**
	 * 获取：日记内容
	 */
    public String getJiatingrijiContent() {
        return jiatingrijiContent;
    }


    /**
	 * 设置：日记内容
	 */
    public void setJiatingrijiContent(String jiatingrijiContent) {
        this.jiatingrijiContent = jiatingrijiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
