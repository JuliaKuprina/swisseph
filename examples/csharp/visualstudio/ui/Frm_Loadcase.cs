/***************************************************************************
 Copyright (C) 2008 RadixPro/Jan Kampherbeek (http://radixpro.org).	  
                                                                        
 This program is free software; you can redistribute it and/or          
 modify it under the terms of both the GNU General Public License (GPL).
 You should also adhere to the terms of the Swiss Ephemerice            
 License (SEPL).                                                        
 The GPL is published by the Free Software Foundation; either version 3 
 of the License, or (at your option) any later version is effective. 	  
 The SEPL (Swiss Ephemeris License) is published by AstroDienst; either 
 version 0.2 of the License, or (at your option) any later version is   
 effective.                                                             
 This program is distributed in the hope that it will be useful, but	  
 WITHOUT ANY WARRANTY; without even the implied warranty of	          
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 	  
 General Public License for more details.                               
                                                                        
 You should have received a copy of the GPL along with this program; 	  
 if not, download a copy from http://www.gnu.org/copyleft/gpl.html      
 You also should have received a copy of the SEPL along with this program; 
 if not, download a copy from http://www.astro.com/swisseph/sepl.htm                                 
 ***************************************************************************/

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using radixpro.controller;

namespace radixpro.ui {
    /// <summary>
    /// Form to load a case.
    /// Not used in ucrrent version.
    /// </summary>
    public partial class Frm_Loadcase : Form {

        private Agent _agent;

        /// <summary>
        /// Form for loading a case from file
        /// </summary>
        public Frm_Loadcase() {
            InitializeComponent();
        }

        /// <summary>
        /// Agent for this form
        /// </summary>
        public Agent agent {
            get {return _agent; }
            set {_agent = value; }
        }


        private void button1_Click(object sender, EventArgs e) {
            OpenFileDialog dlg = new OpenFileDialog();
            dlg.Title = "Load a chart";
            dlg.Filter = "jpg files (*.jpg)|*.jpg|All files (*.*)|*.*";
            dlg.ShowDialog();
            // get data
            dlg.Dispose();
        }


    }
}