package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@TeleOp(name="Forward_BackwardCode", group="Teleop")
public class Forward_BackwardCode extends OpMode {
//@Disabled
    DcMotor LeftWheel;
    DcMotor RightWheel;

    double drivePower=.5;

    @Override
    public void init() {
         LeftWheel = hardwareMap.dcMotor.get("left_wheel");
        RightWheel = hardwareMap.dcMotor.get("right_wheel");

        RightWheel.setDirection(DcMotorSimple.Direction.REVERSE );
    }

    @Override
    public void loop() {
        LeftWheel.setPower(drivePower);
        RightWheel.setPower(-drivePower);

    }


}


