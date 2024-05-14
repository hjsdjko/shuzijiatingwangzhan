package com.entity.view;

import com.entity.JiatingjiyuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 家庭寄语
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiatingjiyu")
public class JiatingjiyuView extends JiatingjiyuEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 家庭
			*/
			private Integer yonghuTypes;
				/**
				* 家庭的值
				*/
				private String yonghuValue;
			/**
			* 身份
			*/
			private Integer shenfenTypes;
				/**
				* 身份的值
				*/
				private String shenfenValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiatingjiyuView() {

	}

	public JiatingjiyuView(JiatingjiyuEntity jiatingjiyuEntity) {
		try {
			BeanUtils.copyProperties(this, jiatingjiyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 家庭
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 家庭
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 家庭的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 家庭的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}

					/**
					* 获取： 身份
					*/
					public Integer getShenfenTypes() {
						return shenfenTypes;
					}
					/**
					* 设置： 身份
					*/
					public void setShenfenTypes(Integer shenfenTypes) {
						this.shenfenTypes = shenfenTypes;
					}


						/**
						* 获取： 身份的值
						*/
						public String getShenfenValue() {
							return shenfenValue;
						}
						/**
						* 设置： 身份的值
						*/
						public void setShenfenValue(String shenfenValue) {
							this.shenfenValue = shenfenValue;
						}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


}
