package com.example.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class Arm extends Fragment {

    public Arm(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = (View) inflater.inflate(R.layout.arm, null);

        ImageButton up2=(ImageButton) root.findViewById(R.id.up2);

        up2.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("U".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        ImageButton down2=(ImageButton) root.findViewById(R.id.down2);

        down2.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("V".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        ImageButton rightrot=(ImageButton) root.findViewById(R.id.rightrot);

        rightrot.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("P".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        ImageButton leftrot=(ImageButton) root.findViewById(R.id.leftrot);

        leftrot.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("Q".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        Button into=(Button) root.findViewById(R.id.into);

        into.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("T".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        Button out=(Button) root.findViewById(R.id.out);

        out.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("X".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        Button close=(Button) root.findViewById(R.id.close);

        close.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("C".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        Button open=(Button) root.findViewById(R.id.open);

        open.setOnTouchListener(new View.OnTouchListener() {

            @Override

            public boolean onTouch(View arg0, MotionEvent arg1) {

                // TODO Auto-generated method stub

                int action = arg1.getAction();

                if(action == MotionEvent.ACTION_DOWN) {

                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("N".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    return true;

                } else if (action == MotionEvent.ACTION_UP) {
                    if (MainActivity.btSocket != null) {
                        try {
                            MainActivity.btSocket.getOutputStream().write("0".getBytes());
                            return true;
                        } catch (IOException e) {

                     /*   try {
                            MainActivity.btSocket.getOutputStream().close();
                        } catch (IOException ee) {
                            e.printStackTrace();
                        }*/
                        }

                    }
                    // check logine functionality.

                    return true;


                }

                return false;

            }

        });
        return root;
    }
}
