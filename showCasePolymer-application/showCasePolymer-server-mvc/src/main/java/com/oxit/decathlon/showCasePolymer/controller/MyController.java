package com.oxit.decathlon.showCasePolymer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oxit.decathlon.showCasePolymer.dto.Language;
import com.oxit.decathlon.showCasePolymer.dto.User;
import com.oxit.decathlon.showCasePolymer.exception.ShowCasePolymerException;
import com.oxit.decathlon.showCasePolymer.facade.LanguageFacade;
import com.oxit.decathlon.showCasePolymer.facade.UserFacade;
import com.oxit.decathlon.showCasePolymer.services.TranslationService;
import com.oxit.fwk.mvc.utils.http.response.JsonResponse;

@Controller
public class MyController {

	@Autowired
	private UserFacade userFacade;
	@Autowired
	private LanguageFacade languageFacade;
	@Autowired
	private TranslationService translationService;
	
	@RequestMapping("/saveUser")
	@ResponseBody
	public JsonResponse<User> saveUser(@RequestParam String name, @RequestParam String surname, @RequestParam String email,
			@RequestParam String societe, @RequestParam String fonction, @RequestParam String lieu, @RequestParam String prefLang) {
		JsonResponse<User> jsonR = new JsonResponse<User>();

		try {
			User result = userFacade.save(name, surname, email, societe, fonction, lieu, prefLang);
			if (result != null) {
				jsonR.setData(result);
				jsonR.setSuccess(true);
			} else {
				throw new ShowCasePolymerException("Error: None user saved, please try again");
			}
		} catch (ShowCasePolymerException e) {
			jsonR.addError("ShowCasePolymerException", e.getMessage());
			jsonR.setSuccess(false);
		}
		return jsonR;
	}

	@RequestMapping("/getUserGetMethod")
	@ResponseBody
	public JsonResponse<List<User>> getUserGetMethod(@RequestParam(required = false) String name, @RequestParam(required = false) String surname) {
		JsonResponse<List<User>> jsonR = new JsonResponse<List<User>>();
		List<User> result = null;

		try {
			result = userFacade.get(name, surname);
			if (result != null && !result.isEmpty()) {
				jsonR.setData(result);
				jsonR.setSuccess(true);
			} else {
				throw new ShowCasePolymerException("None user found");
			}
		} catch (ShowCasePolymerException e) {
			jsonR.addError("ShowCasePolymerException", e.getMessage());
			jsonR.setSuccess(false);
		}
		return jsonR;
	}

	@RequestMapping("/getUserPostMethod")
	@ResponseBody
	public JsonResponse<List<User>> getUserPostMethod(@RequestBody User user) {
		JsonResponse<List<User>> jsonR = new JsonResponse<List<User>>();
		List<User> result = null;
		try {
			result = userFacade.get(user.getName(), user.getSurname());
			if (result != null && !result.isEmpty()) {
				jsonR.setData(result);
				jsonR.setSuccess(true);
			} else {
				throw new ShowCasePolymerException("None user found");
			}
		} catch (ShowCasePolymerException e) {
			jsonR.addError("ShowCasePolymerException", e.getMessage());
			jsonR.setSuccess(false);
		}
		return jsonR;
	}

	@RequestMapping("/getLanguages")
	@ResponseBody
	public JsonResponse<List<Language>> getLanguages(@RequestParam(required = false) String name, @RequestParam(required = false) String surname) {
		JsonResponse<List<Language>> jsonR = new JsonResponse<List<Language>>();
		List<Language> result = null;
		try {
			result = languageFacade.get();
			if (result != null && !result.isEmpty()) {
				jsonR.setData(result);
				jsonR.setSuccess(true);
			} else {
				throw new ShowCasePolymerException("None language found");
			}
		} catch (ShowCasePolymerException e) {
			jsonR.addError("ShowCasePolymerException", e.getMessage());
			jsonR.setSuccess(false);
		}
		return jsonR;
	}

	@RequestMapping("/getTranslation")
	@ResponseBody
	public JsonResponse<String> getTranslation(@RequestParam String context, @RequestParam String labelCode, @RequestParam String language) {
		JsonResponse<String> jsonR = new JsonResponse<String>();
		String result = null;
		try {
			result = translationService.get(context, labelCode, language);
			if (result != null) {
				jsonR.setData(result);
				jsonR.setSuccess(true);
			} else {
				throw new ShowCasePolymerException("None translation found");
			}
		} catch (ShowCasePolymerException e) {
			jsonR.addError("ShowCasePolymerException", e.getMessage());
			jsonR.setSuccess(false);
		}
		return jsonR;
	}
}
