package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Gamepad_ServosTeleop", group= "Teleop")
public class Gamepad_ServosTeleop extends OpMode {
    DcMotor LeftWheel;
    DcMotor RightWheel;
    double leftWheelPower;
    double rightWheelPower;

    @Override
    public void init() {
        LeftWheel= hardwareMap.dcMotor.get("left_wheel");
        RightWheel= hardwareMap.dcMotor.get("right_wheel");

        RightWheel.setDirection(DcMotorSimple.Direction.REVERSE);


    }

   @Override
    public void loop() {
        leftWheelPower = -gamepad1.left_stick_y;
        rightWheelPower = -gamepad1.right_stick_y;

        LeftWheel.setPower(leftWheelPower);
        RightWheel.setPower(rightWheelPower);
    }
   
}


