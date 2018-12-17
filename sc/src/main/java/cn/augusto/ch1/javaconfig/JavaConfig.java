package cn.augusto.ch1.javaconfig;

import cn.augusto.ch1.di.FunctionService;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
  @Bean
  public FuncService funcService(){
    return new FuncService();
  }

  @Bean
  public UseFuncService useFuncService(){
    UseFuncService ufs = new UseFuncService();
    FuncService fs = funcService();
    fs.prefix = "nidaye";
    ufs.setFs(fs);
    return ufs;
  }

  @Bean
  public UseFuncService useFuncService(FuncService fs){
    UseFuncService ufs = new UseFuncService();
    fs.prefix = "with param";
    ufs.setFs(fs);
    return ufs;
  }
}
