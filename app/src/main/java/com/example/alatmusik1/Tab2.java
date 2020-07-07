package com.example.alatmusik1;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    MediaPlayer  mp;
    private OnFragmentInteractionListener mListener;

    public Tab2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab2.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab2 newInstance(String param1, String param2) {
        Tab2 fragment = new Tab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_tab2, container, false);
        final LinearLayout btnKarinding = (LinearLayout) rootView.findViewById(R.id.btn_karinding);
        LinearLayout btnBangsialas = (LinearLayout) rootView.findViewById(R.id.btn_bangsialas);
        LinearLayout btnPikon = (LinearLayout) rootView.findViewById(R.id.btn_pikon);
        LinearLayout btnSerunai = (LinearLayout) rootView.findViewById(R.id.btn_serunai);
        LinearLayout btnSurdam = (LinearLayout) rootView.findViewById(R.id.btn_surdam);
        final TextView pengertianTv = (TextView) rootView.findViewById(R.id.perngertianTv);
        final TextView sejarahTv = (TextView) rootView.findViewById(R.id.sejarahTv);
        final ImageView imgAlat = (ImageView) rootView.findViewById(R.id.img_tarawangsa);
        final TextView titleTv = (TextView) rootView.findViewById(R.id.titleTv);
        final ImageView imgButton = (ImageView) rootView.findViewById(R.id.play_btn);
        imgButton.setImageResource(R.drawable.ic_sound_48);
        mp = MediaPlayer.create(getActivity(), R.raw.bangsi_alas);
        imgButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.start();
                imgButton.setImageResource(R.drawable.ic_mute_48);
                imgButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.stop();
                        imgButton.setImageResource(R.drawable.ic_sound_48);
                    }
                });
            }
        });
        //karinding
        btnKarinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.karinding);
                titleTv.setText("KARINDING");
                pengertianTv.setText(R.string.karinding);
                sejarahTv.setText(R.string.karinding_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.release();
                mp = MediaPlayer.create(getActivity(), R.raw.karinding);

                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                                return;
                            }
                        });
                    }
                });
            }
        });
        //Tarawangsa
        btnBangsialas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.bangsi_alas);
                titleTv.setText("BANGSI ALAS");
                pengertianTv.setText(R.string.bangsi);
                sejarahTv.setText(R.string.bangsi_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.bangsi_alas);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnPikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.pikon);
                titleTv.setText("PIKON");
                pengertianTv.setText(R.string.pikon);
                sejarahTv.setText(R.string.pikon_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.pikon);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnSerunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.serunai_banjar);
                titleTv.setText("SERUNAI BANJAR");
                pengertianTv.setText(R.string.serunai);
                sejarahTv.setText(R.string.serunai_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.serunai_banjar);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnSurdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.surdam1);
                titleTv.setText("SURDAM");
                pengertianTv.setText(R.string.surdam);
                sejarahTv.setText(R.string.surdam_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.surdam);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
