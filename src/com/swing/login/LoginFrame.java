package com.swing.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.base.BaseInfo;
import com.util.HttpAccessServer;
import com.util.StringUtil;
import com.vo.User;


public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
    private JTextField userJTextField;
    private JPasswordField passwordJPasswordField;
    private JLabel companyNameJLabel;
    private JLabel userJLabel;
    private JLabel passwordJLabel;
    private JButton loginJButton;
    private JButton logoutJButton;
    private ImageIcon backgroundImageIcon;
    private int backgroundImageWidth;
    private int backgroundImageHeight;
    
    public LoginFrame() {
    	//加载背景图片
    	URL backgroundUrl=LoginFrame.class.getClassLoader().getResource(BaseInfo.imagesPath+"background.gif");
        backgroundImageIcon = new ImageIcon(backgroundUrl);
        //获取背景图片宽度像素
        backgroundImageWidth=backgroundImageIcon.getIconWidth();
        //获取背景图片高度像素
        backgroundImageHeight=backgroundImageIcon.getIconHeight();
        //设置窗口标题
        this.setTitle("系统登录");
        //设置窗口的宽、高，分别等于背景图片的宽、高，长度单位是像素
        this.setSize(backgroundImageWidth,backgroundImageHeight);       
        //初始化窗口内组件
        initComponent();
        //设置窗口关闭按钮，单击时执行的操作(关闭、隐藏等)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口内容布局方式为绝对定位（此处不指定任何布局管理器，即绝对定位）
        this.setLayout(null);
        //设置窗口相对于父类JFrame的相对位置（距离JFrame左边、上边、自己的宽高等位置）
        this.setBounds(0, 0,backgroundImageWidth,backgroundImageHeight);
        //设置窗口的标题图标
        URL prodlogoUrl=LoginFrame.class.getClassLoader().getResource(BaseInfo.imagesPath+"prodlogo.gif");
        this.setIconImage(new ImageIcon(prodlogoUrl).getImage());
        //设置窗口是否可以调整大小，参数为布尔值
        this.setResizable(false);
        //设置窗口相对于电脑显示器屏幕左上角的相对位置（null即是位于屏幕中央）
        this.setLocationRelativeTo(null);
        //设置窗口是否可见（此语句必须有，否则看不到界面，失去了创建界面的意义）
        this.setVisible(true);
    }
 
    public void initComponent() {
        //设置companyNameJLabel的宽、高、以及距离右边框的间隙大小
        int companyNameJLabelWidth=260;
        int companyNameJLabelHeight=20;       
        int companyNameJLabelGap=28;
        int companyNameJLabelX=this.getWidth()-companyNameJLabelWidth-companyNameJLabelGap;
        companyNameJLabel = new JLabel();
        companyNameJLabel.setText("北京英克科技有限公司 管理信息系统");
        companyNameJLabel.setBounds(companyNameJLabelX, 26, companyNameJLabelWidth, companyNameJLabelHeight);
 
        //设置companyNameJLabel的宽、高、以及距离右边框的间隙大小
        int userJLabelWidth=70;
        int userJLabelHeight=20;
        int userJTextFieldWidth=150;
        int userJTextFieldHeight=20;    
        int rightGap=30;
        int userJLlabelX=this.getWidth()-userJLabelWidth-userJTextFieldWidth;
        int userJTextFieldX=this.getWidth()-userJTextFieldWidth-rightGap;
        userJLabel = new JLabel("用户：");
        userJLabel.setBounds(userJLlabelX, 100, userJLabelWidth, userJLabelHeight);        
        userJTextField = new JTextField();
        userJTextField.setText(this.getWidth()+"  "+this.getHeight());
        userJTextField.setBounds(userJTextFieldX, 100, userJTextFieldWidth, userJTextFieldHeight);

        //设置companyNameJLabel的宽、高、以及距离右边框的间隙大小
        int passwordJLabelWidth=70;
        int passwordJLabelHeight=20;
        int passwordJPasswordFieldWidth=150;
        int passwordJPasswordFieldHeight=20;
        int passwordJLabelX=this.getWidth()-passwordJLabelWidth-passwordJPasswordFieldWidth;
        int passwordJPasswordFieldX=this.getWidth()-passwordJPasswordFieldWidth-rightGap;
        passwordJLabel = new JLabel("密码：");
        passwordJLabel.setBounds(passwordJLabelX, 130, passwordJLabelWidth, passwordJLabelHeight);
        passwordJPasswordField = new JPasswordField();
        passwordJPasswordField.setText("password");
        passwordJPasswordField.setBounds(passwordJPasswordFieldX, 130, passwordJPasswordFieldWidth, passwordJPasswordFieldHeight);
        
        //设置loginJButton、logoutJButton的宽、高、以及loginJButton距离右边框的间隙大小
        int loginJButtonWidth=65;
        int loginJButtonHeight=20;   
        int logoutJButtonWidth=65;
        int logoutJButtonHeight=20;  
        int loginJButtonGap=46;
        int loginJButtonX=this.getWidth()-loginJButtonWidth-logoutJButtonWidth-loginJButtonGap;
        loginJButton = new JButton("登录");
        loginJButton.setBounds(loginJButtonX, 170, loginJButtonWidth, loginJButtonHeight);
		loginJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				loginJButtonActionPerformed(evt);
			}
		});
		
        //设置logoutJButton距离右边框的间隙大小
		int logoutJButtonGap=28;
        int logoutJButtonX=this.getWidth()-logoutJButtonWidth-logoutJButtonGap;
        logoutJButton = new JButton("退出");
        logoutJButton.setBounds(logoutJButtonX, 170, logoutJButtonWidth, logoutJButtonHeight);
		logoutJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				logoutJButtonActionPerformed(evt);
			}
		});

		//把背景图片放置到窗口的第二层JlayerPane
		JLabel backgroundJLabel = new JLabel();
        backgroundJLabel.setIcon(backgroundImageIcon);
        backgroundJLabel.setBounds(-2, -2, backgroundImageWidth,backgroundImageHeight);
        getLayeredPane().add(backgroundJLabel,new Integer(Integer.MIN_VALUE)); 
        //JLabel、JButton等类型的组件都加载到第二层JlayerPane上面
        backgroundJLabel.add(companyNameJLabel);
        backgroundJLabel.add(userJLabel);
        backgroundJLabel.add(passwordJLabel);
        backgroundJLabel.add(loginJButton);
        backgroundJLabel.add(logoutJButton);
        
        //把JTextField、JPasswordField放置到窗口的第三层ContentPan
    	JPanel  loginFrameContainer = (JPanel) this.getContentPane();
    	//把第三层设置为透明层，使得可以看到第二层上的信息
        loginFrameContainer.setOpaque(false);
        
        loginFrameContainer.add(userJTextField);
        loginFrameContainer.add(passwordJPasswordField);
 
    }
 
	private void loginJButtonActionPerformed(ActionEvent evt) {
		String userName = userJTextField.getText();
		String password = new String(passwordJPasswordField.getPassword());
		if (StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "用户必须填写！");
			return;
		}
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码必须填写");
			return;
		}
		User user = new User(userName, password);
		accessServerByHttpURLConnection(user);
		this.dispose();
		new MainFrame();
	}

	private void accessServerByHttpURLConnection(User user){
		try {
			//普通表单请求-单一字符串形式
			String contentType_form="application/x-www-form-urlencoded;";
			String accessController = new String("http://127.0.0.1:8080/UI_SWING/server/controller/authenticationController");

	    	//访问Server的输入输出参数对象
	    	String requestParamString=null;
	    	String responseResultStrig=null;

	    	//把多个参数用&和=拼接成字符串，然后用POST方式提交到服务器
			StringBuffer paramStringBuffer=new StringBuffer();
			paramStringBuffer.append("phoneNo=" + "13526687281");
			paramStringBuffer.append("&password=" + "111111");	
			requestParamString=paramStringBuffer.toString();
			URL url=new URL(accessController+"/loginConfirmation");
			
			HttpAccessServer httpAccessServer=new HttpAccessServer();
			responseResultStrig=httpAccessServer.sendStringData(url, contentType_form, requestParamString);
			System.out.println("server端返回的响应结果：");
			System.out.println(responseResultStrig);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void logoutJButtonActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
    public static void main(String[] args) {
        new LoginFrame();
    }
 
}