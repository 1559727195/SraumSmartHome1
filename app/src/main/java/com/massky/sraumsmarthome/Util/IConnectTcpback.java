package com.massky.sraumsmarthome.Util;

/**
 * 加调接口
 * @author Administrator
 *
 */
public interface IConnectTcpback {
	/**
	 * 处理程序
	 */
	 void process();
	void error(int connect_ctp);

}
