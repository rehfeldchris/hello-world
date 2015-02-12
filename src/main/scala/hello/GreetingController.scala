package hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ResponseBody, RequestMapping, RequestMethod}

@Controller
@RequestMapping(Array("/"))
class GreetingController () {

  @RequestMapping(method = Array(RequestMethod.GET))
  @ResponseBody
  def index(): String = {
    "hello world"
  }
}