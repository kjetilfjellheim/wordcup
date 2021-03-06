/**
 * @fileoverview This file is generated by the Angular template compiler.
 * Do not edit.
 * @suppress {suspiciousCode,uselessCode,missingProperties,missingOverride}
 */
 /* tslint:disable */


import * as i0 from '@angular/core';
import * as i1 from '../../app/app.module';
import * as i2 from '../../app/home/home.component';
import * as i3 from './about/about.component.ngfactory';
import * as i4 from './profile/profile.component.ngfactory';
import * as i5 from './listcruises/listcruise.component.ngfactory';
import * as i6 from './listcruises/cruise/cruise.component.ngfactory';
import * as i7 from './home/home.component.ngfactory';
import * as i8 from '@angular/common';
import * as i9 from '@angular/platform-browser';
import * as i10 from '@angular/animations/browser';
import * as i11 from '@angular/platform-browser/animations';
import * as i12 from '@angular/animations';
import * as i13 from '@angular/forms';
import * as i14 from '@angular/http';
import * as i15 from '../../app/common/cache-remover';
import * as i16 from '../../app/lookups/config.service';
import * as i17 from '../../app/lookups/csrrole-dropdown.service';
import * as i18 from '../../app/lookups/datatype-dropdown.service';
import * as i19 from '../../app/lookups/collectedstatus-dropdown.service';
import * as i20 from '../../app/lookups/seaarea-dropdown.service';
import * as i21 from '../../app/lookups/csrunit-dropdown.service';
import * as i22 from '../../app/lookups/csrsampletype-dropdown.service';
import * as i23 from '../../app/lookups/csrsamplegroup-dropdown.service';
import * as i24 from '../../app/lookups/platformcodesys-dropdown.service';
import * as i25 from '../../app/lookups/cruiseseries-dropdown.service';
import * as i26 from '../../app/lookups/institution-dropdown.service';
import * as i27 from '../../app/lookups/nation-dropdown.service';
import * as i28 from '../../app/lookups/platformtype-dropdown.service';
import * as i29 from '../../app/lookups/missiontype-dropdown.service';
import * as i30 from '../../app/lookups/project-dropdown.service';
import * as i31 from '../../app/lookups/cruisestatus-dropdown.service';
import * as i32 from '../../app/lookups/language-dropdown.service';
import * as i33 from '@angular/router';
import * as i34 from 'angular2-cookie/services/cookies.service';
import * as i35 from 'angular2-cookie/services/base-cookie-options';
import * as i36 from '../../app/listcruises/listcruise.service';
import * as i37 from '../../app/listcruises/cruise/cruise.service';
import * as i38 from '../../app/profile/profile.service';
import * as i39 from 'ng2-archwizard/dist/archwizard.module';
import * as i40 from 'primeng/components/common/shared';
import * as i41 from 'primeng/components/paginator/paginator';
import * as i42 from 'primeng/components/datatable/datatable';
import * as i43 from 'primeng/components/dialog/dialog';
import * as i44 from 'primeng/components/growl/growl';
import * as i45 from 'primeng/components/button/button';
import * as i46 from 'primeng/components/calendar/calendar';
import * as i47 from 'primeng/components/checkbox/checkbox';
import * as i48 from 'primeng/components/dropdown/dropdown';
import * as i49 from 'primeng/components/tristatecheckbox/tristatecheckbox';
import * as i50 from 'primeng/components/multiselect/multiselect';
import * as i51 from 'primeng/components/tooltip/tooltip';
import * as i52 from '../../app/lookups/lookups.module';
import * as i53 from 'primeng/components/tabview/tabview';
import * as i54 from '../../app/about/about.component';
import * as i55 from '../../app/profile/profile.component';
import * as i56 from '../../app/listcruises/listcruise.component';
import * as i57 from '../../app/listcruises/cruise/cruise.component';
export const AppModuleNgFactory:i0.NgModuleFactory<i1.AppModule> = i0.ɵcmf(i1.AppModule,
    [i2.HomeComponent],(_l:any) => {
      return i0.ɵmod([i0.ɵmpd(512,i0.ComponentFactoryResolver,i0.ɵCodegenComponentFactoryResolver,
          [[8,[i3.AboutComponentNgFactory,i4.ProfileComponentNgFactory,i5.ListCruiseComponentNgFactory,
              i6.CruiseComponentNgFactory,i7.HomeComponentNgFactory]],[3,i0.ComponentFactoryResolver],
              i0.NgModuleRef]),i0.ɵmpd(5120,i0.LOCALE_ID,i0.ɵm,[[3,i0.LOCALE_ID]]),
          i0.ɵmpd(4608,i8.NgLocalization,i8.NgLocaleLocalization,[i0.LOCALE_ID]),i0.ɵmpd(5120,
              i0.APP_ID,i0.ɵf,([] as any[])),i0.ɵmpd(5120,i0.IterableDiffers,i0.ɵk,
              ([] as any[])),i0.ɵmpd(5120,i0.KeyValueDiffers,i0.ɵl,([] as any[])),
          i0.ɵmpd(4608,i9.DomSanitizer,i9.ɵe,[i8.DOCUMENT]),i0.ɵmpd(6144,i0.Sanitizer,
              (null as any),[i9.DomSanitizer]),i0.ɵmpd(4608,i9.HAMMER_GESTURE_CONFIG,
              i9.HammerGestureConfig,([] as any[])),i0.ɵmpd(5120,i9.EVENT_MANAGER_PLUGINS,
              (p0_0:any,p1_0:any,p2_0:any,p2_1:any) => {
                return [new i9.ɵDomEventsPlugin(p0_0),new i9.ɵKeyEventsPlugin(p1_0),
                    new i9.ɵHammerGesturesPlugin(p2_0,p2_1)];
              },[i8.DOCUMENT,i8.DOCUMENT,i8.DOCUMENT,i9.HAMMER_GESTURE_CONFIG]),i0.ɵmpd(4608,
              i9.EventManager,i9.EventManager,[i9.EVENT_MANAGER_PLUGINS,i0.NgZone]),
          i0.ɵmpd(135680,i9.ɵDomSharedStylesHost,i9.ɵDomSharedStylesHost,[i8.DOCUMENT]),
          i0.ɵmpd(4608,i9.ɵDomRendererFactory2,i9.ɵDomRendererFactory2,[i9.EventManager,
              i9.ɵDomSharedStylesHost]),i0.ɵmpd(5120,i10.AnimationDriver,i11.ɵc,([] as any[])),
          i0.ɵmpd(5120,i10.ɵAnimationStyleNormalizer,i11.ɵd,([] as any[])),i0.ɵmpd(4608,
              i10.ɵAnimationEngine,i11.ɵb,[i10.AnimationDriver,i10.ɵAnimationStyleNormalizer]),
          i0.ɵmpd(5120,i0.RendererFactory2,i11.ɵe,[i9.ɵDomRendererFactory2,i10.ɵAnimationEngine,
              i0.NgZone]),i0.ɵmpd(6144,i9.ɵSharedStylesHost,(null as any),[i9.ɵDomSharedStylesHost]),
          i0.ɵmpd(4608,i0.Testability,i0.Testability,[i0.NgZone]),i0.ɵmpd(4608,i9.Meta,
              i9.Meta,[i8.DOCUMENT]),i0.ɵmpd(4608,i9.Title,i9.Title,[i8.DOCUMENT]),
          i0.ɵmpd(4608,i12.AnimationBuilder,i11.ɵBrowserAnimationBuilder,[i0.RendererFactory2]),
          i0.ɵmpd(4608,i13.ɵi,i13.ɵi,([] as any[])),i0.ɵmpd(4608,i13.FormBuilder,i13.FormBuilder,
              ([] as any[])),i0.ɵmpd(4608,i14.BrowserXhr,i14.BrowserXhr,([] as any[])),
          i0.ɵmpd(4608,i14.ResponseOptions,i14.BaseResponseOptions,([] as any[])),
          i0.ɵmpd(5120,i14.XSRFStrategy,i14.ɵb,([] as any[])),i0.ɵmpd(4608,i14.XHRBackend,
              i14.XHRBackend,[i14.BrowserXhr,i14.ResponseOptions,i14.XSRFStrategy]),
          i0.ɵmpd(4608,i14.RequestOptions,i15.CustomRequestOptions,([] as any[])),
          i0.ɵmpd(5120,i14.Http,i14.ɵc,[i14.XHRBackend,i14.RequestOptions]),i0.ɵmpd(4608,
              i16.ConfigService,i16.ConfigService,[i14.Http]),i0.ɵmpd(4608,i17.CSRRoleDropdownService,
              i17.CSRRoleDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i18.DatatypeDropdownService,i18.DatatypeDropdownService,[i14.Http,i16.ConfigService]),
          i0.ɵmpd(4608,i19.CollectedStatusDropdownService,i19.CollectedStatusDropdownService,
              [i14.Http,i16.ConfigService]),i0.ɵmpd(4608,i20.SeaareaDropdownService,
              i20.SeaareaDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i21.CSRUnitDropdownService,i21.CSRUnitDropdownService,[i14.Http,i16.ConfigService]),
          i0.ɵmpd(4608,i22.CSRSampleTypeDropdownService,i22.CSRSampleTypeDropdownService,
              [i14.Http,i16.ConfigService]),i0.ɵmpd(4608,i23.CSRSampleGroupDropdownService,
              i23.CSRSampleGroupDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i24.PlatformcodesysDropdownService,i24.PlatformcodesysDropdownService,
              [i14.Http,i16.ConfigService]),i0.ɵmpd(4608,i25.CruiseseriesDropdownService,
              i25.CruiseseriesDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i26.InstitutionDropdownService,i26.InstitutionDropdownService,[i14.Http,
                  i16.ConfigService]),i0.ɵmpd(4608,i27.NationDropdownService,i27.NationDropdownService,
              [i14.Http,i16.ConfigService]),i0.ɵmpd(4608,i28.PlatformTypeDropdownService,
              i28.PlatformTypeDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i29.MissiontypeDropdownService,i29.MissiontypeDropdownService,[i14.Http,
                  i16.ConfigService]),i0.ɵmpd(4608,i30.ProjectDropdownService,i30.ProjectDropdownService,
              [i14.Http,i16.ConfigService]),i0.ɵmpd(4608,i31.CruisestatusDropdownService,
              i31.CruisestatusDropdownService,[i14.Http,i16.ConfigService]),i0.ɵmpd(4608,
              i32.LanguageDropdownService,i32.LanguageDropdownService,[i14.Http,i16.ConfigService]),
          i0.ɵmpd(5120,i33.ActivatedRoute,i33.ɵf,[i33.Router]),i0.ɵmpd(4608,i33.NoPreloading,
              i33.NoPreloading,([] as any[])),i0.ɵmpd(6144,i33.PreloadingStrategy,
              (null as any),[i33.NoPreloading]),i0.ɵmpd(135680,i33.RouterPreloader,
              i33.RouterPreloader,[i33.Router,i0.NgModuleFactoryLoader,i0.Compiler,
                  i0.Injector,i33.PreloadingStrategy]),i0.ɵmpd(4608,i33.PreloadAllModules,
              i33.PreloadAllModules,([] as any[])),i0.ɵmpd(5120,i33.ROUTER_INITIALIZER,
              i33.ɵi,[i33.ɵg]),i0.ɵmpd(5120,i0.APP_BOOTSTRAP_LISTENER,(p0_0:any) => {
            return [p0_0];
          },[i33.ROUTER_INITIALIZER]),i0.ɵmpd(4608,i34.CookieService,i34.CookieService,
              [i35.CookieOptions]),i0.ɵmpd(4608,i36.ListCruiseService,i36.ListCruiseService,
              [i14.Http]),i0.ɵmpd(4608,i37.CruiseService,i37.CruiseService,[i14.Http]),
          i0.ɵmpd(4608,i38.ProfileService,i38.ProfileService,[i14.Http]),i0.ɵmpd(512,
              i8.CommonModule,i8.CommonModule,([] as any[])),i0.ɵmpd(1024,i0.ErrorHandler,
              i9.ɵa,([] as any[])),i0.ɵmpd(1024,i0.NgProbeToken,() => {
            return [i33.ɵb()];
          },([] as any[])),i0.ɵmpd(512,i33.ɵg,i33.ɵg,[i0.Injector]),i0.ɵmpd(1024,i0.APP_INITIALIZER,
              (p0_0:any,p0_1:any,p1_0:any) => {
                return [i9.ɵc(p0_0,p0_1),i33.ɵh(p1_0)];
              },[[2,i9.NgProbeToken],[2,i0.NgProbeToken],i33.ɵg]),i0.ɵmpd(512,i0.ApplicationInitStatus,
              i0.ApplicationInitStatus,[[2,i0.APP_INITIALIZER]]),i0.ɵmpd(131584,i0.ɵe,
              i0.ɵe,[i0.NgZone,i0.ɵConsole,i0.Injector,i0.ErrorHandler,i0.ComponentFactoryResolver,
                  i0.ApplicationInitStatus]),i0.ɵmpd(2048,i0.ApplicationRef,(null as any),
              [i0.ɵe]),i0.ɵmpd(512,i0.ApplicationModule,i0.ApplicationModule,[i0.ApplicationRef]),
          i0.ɵmpd(512,i9.BrowserModule,i9.BrowserModule,[[3,i9.BrowserModule]]),i0.ɵmpd(512,
              i11.BrowserAnimationsModule,i11.BrowserAnimationsModule,([] as any[])),
          i0.ɵmpd(512,i13.ɵba,i13.ɵba,([] as any[])),i0.ɵmpd(512,i13.FormsModule,i13.FormsModule,
              ([] as any[])),i0.ɵmpd(512,i13.ReactiveFormsModule,i13.ReactiveFormsModule,
              ([] as any[])),i0.ɵmpd(512,i39.ArchwizardModule,i39.ArchwizardModule,
              ([] as any[])),i0.ɵmpd(512,i14.HttpModule,i14.HttpModule,([] as any[])),
          i0.ɵmpd(512,i40.SharedModule,i40.SharedModule,([] as any[])),i0.ɵmpd(512,
              i41.PaginatorModule,i41.PaginatorModule,([] as any[])),i0.ɵmpd(512,i42.DataTableModule,
              i42.DataTableModule,([] as any[])),i0.ɵmpd(512,i43.DialogModule,i43.DialogModule,
              ([] as any[])),i0.ɵmpd(512,i44.GrowlModule,i44.GrowlModule,([] as any[])),
          i0.ɵmpd(512,i45.ButtonModule,i45.ButtonModule,([] as any[])),i0.ɵmpd(512,
              i46.CalendarModule,i46.CalendarModule,([] as any[])),i0.ɵmpd(512,i47.CheckboxModule,
              i47.CheckboxModule,([] as any[])),i0.ɵmpd(512,i48.DropdownModule,i48.DropdownModule,
              ([] as any[])),i0.ɵmpd(512,i49.TriStateCheckboxModule,i49.TriStateCheckboxModule,
              ([] as any[])),i0.ɵmpd(512,i50.MultiSelectModule,i50.MultiSelectModule,
              ([] as any[])),i0.ɵmpd(512,i51.TooltipModule,i51.TooltipModule,([] as any[])),
          i0.ɵmpd(512,i52.LookupsModule,i52.LookupsModule,([] as any[])),i0.ɵmpd(512,
              i53.TabViewModule,i53.TabViewModule,([] as any[])),i0.ɵmpd(1024,i33.ɵa,
              i33.ɵd,[[3,i33.Router]]),i0.ɵmpd(512,i33.UrlSerializer,i33.DefaultUrlSerializer,
              ([] as any[])),i0.ɵmpd(512,i33.ChildrenOutletContexts,i33.ChildrenOutletContexts,
              ([] as any[])),i0.ɵmpd(256,i33.ROUTER_CONFIGURATION,{},([] as any[])),
          i0.ɵmpd(1024,i8.LocationStrategy,i33.ɵc,[i8.PlatformLocation,[2,i8.APP_BASE_HREF],
              i33.ROUTER_CONFIGURATION]),i0.ɵmpd(512,i8.Location,i8.Location,[i8.LocationStrategy]),
          i0.ɵmpd(512,i0.Compiler,i0.Compiler,([] as any[])),i0.ɵmpd(512,i0.NgModuleFactoryLoader,
              i0.SystemJsNgModuleLoader,[i0.Compiler,[2,i0.SystemJsNgModuleLoaderConfig]]),
          i0.ɵmpd(1024,i33.ROUTES,() => {
            return [[{path:'',redirectTo:'/cruises',pathMatch:'full'},{path:'about',
                component:i54.AboutComponent},{path:'profile',component:i55.ProfileComponent},
                {path:'cruises',component:i56.ListCruiseComponent},{path:'cruises/:missiontype',
                    redirectTo:'/cruises',pathMatch:'full'},{path:'cruises/:missiontype/:year',
                    redirectTo:'/cruises',pathMatch:'full'},{path:'cruises/:missiontype/:year/:platformpath',
                    redirectTo:'/cruises',pathMatch:'full'},{path:'cruises/:missiontype/:year/:platformpath/:delivery',
                    component:i57.CruiseComponent}]];
          },([] as any[])),i0.ɵmpd(1024,i33.Router,i33.ɵe,[i0.ApplicationRef,i33.UrlSerializer,
              i33.ChildrenOutletContexts,i8.Location,i0.Injector,i0.NgModuleFactoryLoader,
              i0.Compiler,i33.ROUTES,i33.ROUTER_CONFIGURATION,[2,i33.UrlHandlingStrategy],
              [2,i33.RouteReuseStrategy]]),i0.ɵmpd(512,i33.RouterModule,i33.RouterModule,
              [[2,i33.ɵa],[2,i33.Router]]),i0.ɵmpd(512,i1.AppModule,i1.AppModule,([] as any[])),
          i0.ɵmpd(256,i35.CookieOptions,{},([] as any[]))]);
    });
//# sourceMappingURL=data:application/json;base64,eyJmaWxlIjoiQzovVXNlcnMva2pldGlsZi9Eb2N1bWVudHMvZ2l0bmV3L2FwcGxpY2F0aW9ucy9jcnVpc2UvZnJvbnRlbmQvc3JjL2FwcC9hcHAubW9kdWxlLm5nZmFjdG9yeS50cyIsInZlcnNpb24iOjMsInNvdXJjZVJvb3QiOiIiLCJzb3VyY2VzIjpbIm5nOi8vL0M6L1VzZXJzL2tqZXRpbGYvRG9jdW1lbnRzL2dpdG5ldy9hcHBsaWNhdGlvbnMvY3J1aXNlL2Zyb250ZW5kL3NyYy9hcHAvYXBwLm1vZHVsZS50cyJdLCJzb3VyY2VzQ29udGVudCI6WyIgIl0sIm1hcHBpbmdzIjoiQUFBQTs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7OzsifQ==
