package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveTestWenhan extends OpMode {

    DcMotor leftFrontMotor;
    DcMotor rightFrontMotor;
    DcMotor leftBackMotor;
    DcMotor rightBackMotor;

    @Override
    public void init(){
        leftBackMotor=hardwareMap.dcMotor.get("leftBackmotor");
        leftFrontMotor=hardwareMap.dcMotor.get("leftFrontmotor");
        rightBackMotor=hardwareMap.dcMotor.get("rightbackmotor");
        rightFrontMotor=hardwareMap.dcMotor.get("rightfrontmotor");

        //Right motor is opposite of left motor ( Direction has to be reversed)
        rightFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        //If want to have seperate powers, assign 2 variables, Rigthpower and LeftPower (Tank Drive)

        //sets power
        leftFrontMotor.setPower(0.5);
        leftBackMotor.setPower(0.5);
        rightBackMotor.setPower(0.5);
        rightFrontMotor.setPower(0.5);
    }
}
