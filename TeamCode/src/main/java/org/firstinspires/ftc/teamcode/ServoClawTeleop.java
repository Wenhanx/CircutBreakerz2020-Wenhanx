package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Gamepad_ServosTeleop", group= "Teleop")
public class ServoClawTeleop extends OpMode {
    DcMotor LeftWheel;
    DcMotor RightWheel;
    double leftWheelPower;
    double rightWheelPower;
    Servo leftclaw;
    Servo rightclaw;
    @Override
    public void init() {
        LeftWheel= hardwareMap.dcMotor.get("left_wheel");
        RightWheel= hardwareMap.dcMotor.get("right_wheel");

        RightWheel.setDirection(DcMotorSimple.Direction.REVERSE);


        leftclaw=hardwareMap.servo.get("left_claw");
        rightclaw=hardwareMap.servo.get("right_claw");


    }

   @Override
    public void loop() {
        leftWheelPower = -gamepad1.left_stick_y;
        rightWheelPower = -gamepad1.right_stick_y;

        LeftWheel.setPower(leftWheelPower);
        RightWheel.setPower(rightWheelPower);


       if (gamepad1.x){
            leftclaw.setPosition(1);
            rightclaw.setPosition(1);
        }
        else {
            leftclaw.setPosition(0);
            rightclaw.setPosition(0);
       }
    }

}


