package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

public class ColorSensorWenhan extends OpMode {

    ColorSensor colorSensor;

    @Override
    public void init() {
        colorSensor=hardwareMap.colorSensor.get("color");
    }

    @Override
    public void loop() {
        colorSensor.red();
        colorSensor.blue();
        colorSensor.green();

        colorSensor.argb();
        colorSensor.alpha();

        colorSensor.enableLed(true);
        colorSensor.enableLed(false);


    }
}
