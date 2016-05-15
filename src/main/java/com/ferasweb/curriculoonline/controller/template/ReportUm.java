/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.template;

import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.utils.ReportUtil;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/**
 *
 * @author Andressa
 */
public class ReportUm {
    
    @Inject
    private ReportUtil reportUtil;
    
    public void generateReportUm(Perfil perfil){
       Map map = ReportUtil.getParams();
       
    }
    
}
