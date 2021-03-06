package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeLeakTest extends PipeBaseEntity {

	public static PipeLeakTest pipeLeakTest = null;

	public PipeLeakTest() {
		super();
		this.db_Description = "在用工业管道泄漏性试验记录";
		this.method = "updatePipeLeakTest";//上传servlet的方法名称，很重要

	}

	public static PipeLeakTest getInstance() {
		if (pipeLeakTest == null) {
			pipeLeakTest = new PipeLeakTest();
		}
		return pipeLeakTest;
	}
	
	public String p_Max_Pre;//最高工作压力
	public String p_Exp_Med;//试验介质
	public String p_Exp_Pre;//试验压力
	public String p_Med_Tem;//介质温度
	public String p_Amb_Tem;//环境温度
	public String p_Pump_Pre_Cri;//机泵出口压力表规格
	public String p_Pump_Pre_Acc;//机泵出口压力表精度
	public String p_Line_Pre_Cri;//管线压力表规格
	public String p_Line_Pre_Acc;//管线压力表精度
	public String p_Pump_Type;//机泵型号及编号
	public String p_Ope_Cri;//执行标准
	public String p_Leak_Result;//压力试验结论
	public String p_Leak_Data;//压力检测日期

	@Override
	public String toString() {
		return "PipeLeakTest{" +
				"p_Max_Pre='" + p_Max_Pre + '\'' +
				", p_Exp_Med='" + p_Exp_Med + '\'' +
				", p_Exp_Pre='" + p_Exp_Pre + '\'' +
				", p_Med_Tem='" + p_Med_Tem + '\'' +
				", p_Amb_Tem='" + p_Amb_Tem + '\'' +
				", p_Pump_Pre_Cri='" + p_Pump_Pre_Cri + '\'' +
				", p_Pump_Pre_Acc='" + p_Pump_Pre_Acc + '\'' +
				", p_Line_Pre_Cri='" + p_Line_Pre_Cri + '\'' +
				", p_Line_Pre_Acc='" + p_Line_Pre_Acc + '\'' +
				", p_Pump_Type='" + p_Pump_Type + '\'' +
				", p_Ope_Cri='" + p_Ope_Cri + '\'' +
				", p_Leak_Result='" + p_Leak_Result + '\'' +
				", p_Leak_Data='" + p_Leak_Data + '\'' +
				'}';
	}
}
