package sheridan.franciia.tshirtdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


import sheridan.franciia.tshirtdata.domain.Envelope;

@Controller
public class TShirtDataController {

    private final Logger logger = LoggerFactory.getLogger(TShirtDataController.class);

    @GetMapping(value={"/","input_page"})
    public ModelAndView input(){
        return new ModelAndView("InputPage","envelope",new Envelope());
    }

    @GetMapping("/Process")
    public ModelAndView process(@Validated @ModelAttribute Envelope envelope, BindingResult bindingResult){

        //envelope.setAttribute(attribute);



        if(bindingResult.hasErrors()||envelope.getName()==""){


            return new ModelAndView("InputPage");
        }

        return new ModelAndView("OutputPage","envelope",envelope);
    }
}
