package com.bignerdranch.android.criminalintent;

import android.graphics.Camera;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.*;
import android.widget.Button;
import android.support.v4.app.Fragment;

/**
 * Created by BR026CA on 11/16/2015.
 */
public class CrimeCameraFragment extends Fragment {
    private static final String TAG = "CrimeCameraFragment";

    private SurfaceView mSurfaceView;
    private Camera mCamera;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime_camera, container, false);

        Button takePictureButon = (Button)v.findViewById(R.id.crime_camera_takePictureButton);
        takePictureButon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                getActivity().finish();
            }
        });

        mSurfaceView = (SurfaceView)v.findViewById(R.id.crime_camera_surfaceView);

        return v;
    }
}
