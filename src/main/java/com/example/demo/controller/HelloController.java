package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.HelloForm;

@Controller
@RequestMapping(value = "/")
public class HelloController {
	
	/**
	 * 初期表示用のエンドポイント。
	 * sample/Hello.htmlを返却するのみ。
	 * 
	 * @param helloForm
	 * @return Hello.html
	 */
	@GetMapping
	public String index(@ModelAttribute HelloForm helloForm) {
		return "sample/Hello";
	}

	/**
	 * 検索ボタン押下時のエンドポイント。
	 * 
	 * @param helloForm
	 * @param result
	 * @return
	 */
	@GetMapping("search")
	public String register(@Validated HelloForm helloForm, BindingResult result) {
		
		// 実際にはAPIを呼び出す処理が入る
		
		// APIを呼び出した結果をsample/Result.html的なファイルにマッピングして返却する

		return "sample/Result";
	}
}
