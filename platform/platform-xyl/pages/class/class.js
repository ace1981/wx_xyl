var util = require('../../utils/util.js');
var api = require('../../config/api.js');

Page({
  data: {
    // text:"这是一个页面"
    navList: [{ id: '1', name: 'aishuang' }, { id: '2', name: 'aishuang2' }, { id: '1', name: 'aishuang' }, { id: '1', name: 'aishuang' }, { id: '1', name: 'aishuang' }],
    personsList: [{ id: '1', name: '姜悅萌', company: '上海迪爱斯通信设备有限公司', city: '上海徐汇区', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '2', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://scimg.jb51.net/touxiang/201705/2017052811110637.jpg' }, { id: '3', name: 'name3', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.aspku.com/uploads/allimg/180130/214P1O15-49.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }, { id: '4', name: 'name2', company: '2000', city: '', telephone: '18654222153', birthday: '1984/12/2', list_pic_url: 'http://www.vvfeng.com/data/upload/ueditor/20170512/591519612d6b9.jpg' }],
    id: 0,
    currentClass: { name: '上海大学', front_name:'2000届'},
    scrollLeft: 0,
    scrollTop: 0,
    scrollHeight: 0,
    page: 1,
    size: 10000
  },
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    var that = this;
    console.log('options.id:'+options.id)
    if (options.id) {
      that.setData({
        id: parseInt(options.id)
      });
    }

    wx.getSystemInfo({
      success: function (res) {
        that.setData({
          scrollHeight: res.windowHeight
        });
      }
    });


    this.getCategoryInfo();

  },
  getCategoryInfo: function () {
    let that = this;
    util.request(api.GoodsCategory, { id: this.data.id })
      .then(function (res) {

        if (res.errno == 0) {
          that.setData({
            navList: res.data.brotherCategory,
            currentCategory: res.data.currentCategory
          });

          //nav位置
          let currentIndex = 0;
          let navListCount = that.data.navList.length;
          for (let i = 0; i < navListCount; i++) {
            currentIndex += 1;
            if (that.data.navList[i].id == that.data.id) {
              break;
            }
          }
          if (currentIndex > navListCount / 2 && navListCount > 5) {
            that.setData({
              scrollLeft: currentIndex * 60
            });
          }
          that.getGoodsList();

        } else {
          //显示错误信息
        }
        
      });
  },
  onReady: function () {
    // 页面渲染完成
  },
  onShow: function () {
    // 页面显示
    console.log(1);
  },
  onHide: function () {
    // 页面隐藏
  },
  toPersonDetail: function (event) {
    var that = this;
    console.log('toPersonDetail()' + that.data.id + ' ' + event.currentTarget.dataset.info.id);
    console.log('ID:' + event.currentTarget.dataset.info.id + '，名字叫：' + event.currentTarget.dataset.info.name);
    wx.navigateTo({
      url: '../person/person',
    })
    util.request(api.GoodsList, {categoryId: that.data.id, page: that.data.page, size: that.data.size})
      .then(function (res) {
        that.setData({
          goodsList: res.data.goodsList,
        });
      });
  },
  onUnload: function () {
    // 页面关闭
  }
  
})