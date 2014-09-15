package com.duoduo.demo.aspose;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

/**
 * PPT to HTML
 * @author chengesheng@gmail.com
 * @date 2014-9-15 上午1:00:51
 * @version 1.0.0
 */
public class AsposeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ppt2Html("C:\\temp\\duoduo\\demo2.ppt", "C:\\temp\\duoduo\\demo2.html");

		// ppt2Html("C:\\temp\\demo.ppt", "C:\\temp\\demo.html");

		// for (int i = 1; i < 12; i++) {
		// String index = (i < 10) ? ("0" + i) : ("" + i);
		// ppt2Html("C:\\temp\\duoduo\\demo" + index + ".ppt", "C:\\temp\\duoduo\\demo" + index + ".html");
		// System.out.println("create demo" + index);
		// }
	}

	private static void ppt2Html(String pptPath, String htmlPath) {
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(pptPath);

		HtmlOptions htmlOptions = new HtmlOptions();
		htmlOptions.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("", false));

		// Saving the presentation to HTML
		pres.save(htmlPath, SaveFormat.Html, htmlOptions);
	}

}
