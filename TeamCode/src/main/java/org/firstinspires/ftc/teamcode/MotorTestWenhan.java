package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorTestWenhan extends OpMode {
    //declares variables
    DcMotor motor=null;
    double motorPower;

    @Override
    public void init() {
    motor=hardwareMap.dcMotor.get("motor");
    }

    @Override
    public void loop() {
        //sets the motor power according the the gamepad
        motorPower=-gamepad1.left_stick_y;
        //sets the power to motor
        motor.setPower(motorPower);

    }
}
