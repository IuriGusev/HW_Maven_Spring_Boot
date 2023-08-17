package pro.sky.HWMavenSpring.Boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: не переданы оба числа";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String subtract(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: не переданы оба числа";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: не переданы оба числа";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: не переданы оба числа";
        }
        if (num2 == 0) {
            return "Ошибка: деление на 0";
        }
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}