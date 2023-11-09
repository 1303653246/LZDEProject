package dockingtest;

import cn.hutool.json.JSONUtil;
import org.codehaus.xfire.client.Client;
import org.junit.Test;

import java.net.URL;

/**
 * webservice:
 *
 * @author: 翟树明
 * @time: 2023/11/8 9:42
 */
public class webservice {


    @Test
    public void test1(){
        try {
            //托管三版接口测试

            Client client = new Client(new URL("http://222.222.194.114:8908/interfaceThree/services/InterfaceMethods?wsdl"));

            //获取仪表信息
            Object[] objects1 = {"563"};
            Object[] objects3 = client.invoke("getUserData", objects1);
            System.out.println(JSONUtil.toJsonStr(objects3));
        }catch (Exception e){
        }

    }

}
