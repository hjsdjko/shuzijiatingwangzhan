package com.entity.model;

import com.entity.JiatingqinzishipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家庭亲子视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiatingqinzishipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 亲子视频标题
     */
    private String jiatingqinzishipinName;


    /**
     * 视频类型
     */
    private Integer jiatingqinzishipinTypes;


    /**
     * 封面
     */
    private String jiatingqinzishipinPhoto;


    /**
     * 视频类型
     */
    private String jiatingqinzishipinVideo;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 视频详情
     */
    private String jiatingqinzishipinContent;


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
	 * 获取：亲子视频标题
	 */
    public String getJiatingqinzishipinName() {
        return jiatingqinzishipinName;
    }


    /**
	 * 设置：亲子视频标题
	 */
    public void setJiatingqinzishipinName(String jiatingqinzishipinName) {
        this.jiatingqinzishipinName = jiatingqinzishipinName;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getJiatingqinzishipinTypes() {
        return jiatingqinzishipinTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setJiatingqinzishipinTypes(Integer jiatingqinzishipinTypes) {
        this.jiatingqinzishipinTypes = jiatingqinzishipinTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getJiatingqinzishipinPhoto() {
        return jiatingqinzishipinPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setJiatingqinzishipinPhoto(String jiatingqinzishipinPhoto) {
        this.jiatingqinzishipinPhoto = jiatingqinzishipinPhoto;
    }
    /**
	 * 获取：视频类型
	 */
    public String getJiatingqinzishipinVideo() {
        return jiatingqinzishipinVideo;
    }


    /**
	 * 设置：视频类型
	 */
    public void setJiatingqinzishipinVideo(String jiatingqinzishipinVideo) {
        this.jiatingqinzishipinVideo = jiatingqinzishipinVideo;
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
	 * 获取：视频详情
	 */
    public String getJiatingqinzishipinContent() {
        return jiatingqinzishipinContent;
    }


    /**
	 * 设置：视频详情
	 */
    public void setJiatingqinzishipinContent(String jiatingqinzishipinContent) {
        this.jiatingqinzishipinContent = jiatingqinzishipinContent;
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
