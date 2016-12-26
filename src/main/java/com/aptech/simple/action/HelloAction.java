package com.aptech.simple.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.aptech.simple.HelloForm;

public class HelloAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HelloForm helloForm = (HelloForm)form;
		helloForm.setMessage("Welcome to Struct Framework");
		System.out.println("=====value of message: "+ helloForm.getMessage());
		return mapping.findForward("success");
	}
}
